package fit.iuh.se.controller;


import fit.iuh.se.entity.Post;
import fit.iuh.se.service.PostService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String listPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "post/list";
    }

    @GetMapping("/new")
    public String showAddPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "post/add";
    }

    @PostMapping
    public String addPost(@Valid @ModelAttribute("post") Post post, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "post/add";
        }
        postService.savePost(post);
        return "redirect:/posts";
    }

    @GetMapping("/{id}")
    public String viewPostDetails(@PathVariable int id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "post/detail";
    }

    @GetMapping("/{id}/edit")
    public String showEditPostForm(@PathVariable int id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "post/edit";
    }

    @PostMapping("/{id}")
    public String editPost(@PathVariable int id, @Valid @ModelAttribute("post") Post post, BindingResult result) {
        if (result.hasErrors()) {
            return "post/edit";
        }
        post.setId(id);
        postService.savePost(post);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/delete")
    public String deletePost(@PathVariable int id) {
        postService.deletePostById(id);
        return "redirect:/posts";
    }
}
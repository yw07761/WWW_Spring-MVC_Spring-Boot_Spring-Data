package fit.iuh.se.service;

import fit.iuh.se.entity.Post;
import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(int id);
    Post savePost(Post post);
    void deletePostById(int id);
}
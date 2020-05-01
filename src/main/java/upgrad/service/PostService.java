package upgrad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upgrad.model.Post;
import upgrad.repository.PostRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class PostService {

    @Autowired
    public PostRepository repository;
    public List<Post> getAllPosts()
    {
        return repository.getAllPosts();
      /*  try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/companyDB","postgres", "password");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM posts");
            while(rs.next()){
                Post post = new Post();
                post.setTitle(rs.getString("title"));
                post.setBody(rs.getString("body"));
                posts.add(post);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return posts;*/

    }

    public Post getOnePost() {
        return repository.getLatestPost();
    }

    public void createPost(Post newPost) {
        newPost.setDate(new Date());
        repository.createPost(newPost);
        System.out.println("New Post: "+newPost);
    }

    public Post getPost(Integer postId) {
        return repository.getPost(postId);
    }

    public void editPost(Post updatePost) {
        updatePost.setDate(new Date());
        repository.editPost(updatePost);
    }

    public void deletePost(Integer postId) {
        repository.deletePost(postId);
    }
}

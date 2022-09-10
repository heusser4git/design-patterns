import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {
    @Test
    public void testPost1() {
        Post postBefore = new Post("blog-post", "javadevcentral");
        Post postBuilder = new Post.Builder("blog-post")
                .setAuthor("javadevcentral")
                .build();
        Assertions.assertEquals(postBuilder.toString(), postBefore.toString());
    }

    @Test
    public void testPost2() {
        Post postBefore = new Post("blog-post", "javadevcentral", "17.11");
        Post postBuilder = new Post.Builder("blog-post")
                .setAuthor("javadevcentral")
                .setDatePosted("17.11")
                .build();
        Assertions.assertEquals(postBuilder.toString(), postBefore.toString());
    }
    @Test
    public void testPost3() {
        Post postBefore = new Post("blog-post", "javadevcentral", "18.11", 1000, 5000);
        Post postBuilder = new Post.Builder("blog-post")
                .setAuthor("javadevcentral")
                .setDatePosted("18.11")
                .setNumberOfWords(1000)
                .setNumberOfCharacters(5000)
                .build();
        Assertions.assertEquals(postBuilder.toString(), postBefore.toString());
    }
}
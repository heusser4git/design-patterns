public class Post {
    private String title;
    private String author;
    private String datePosted;
    private int numberOfWords;
    private int numberOfCharacters;

    public static class Builder {
        private String title;
        private String author;
        private String datePosted;
        private int numberOfWords;
        private int numberOfCharacters;

        public Builder(String title) {
            this.title = title;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setDatePosted(String datePosted) {
            this.datePosted = datePosted;
            return this;
        }

        public Builder setNumberOfWords(int numberOfWords) {
            this.numberOfWords = numberOfWords;
            return this;
        }

        public Builder setNumberOfCharacters(int numberOfCharacters) {
            this.numberOfCharacters = numberOfCharacters;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }

    public Post(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.datePosted = builder.datePosted;
        this.numberOfWords = builder.numberOfWords;
        this.numberOfCharacters = builder.numberOfCharacters;
    }

    public Post(String title, String author) {
        this(title, author, null);
    }
    public Post(String title, String author, String datePosted) {
        this(title, author, datePosted, 0);
    }
    public Post(String title, String author, String datePosted, int numberOfWords) {
        this(title, author, datePosted, numberOfWords, 0);
    }
    public Post(String title, String author, String datePosted, int numberOfWords, int numberOfCharacters) {
        this.title = title;
        this.author = author;
        this.datePosted = datePosted;
        this.numberOfWords = numberOfWords;
        this.numberOfCharacters = numberOfCharacters;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", datePosted='" + datePosted + '\'' +
                ", numberOfWords=" + numberOfWords +
                ", numberOfCharacters=" + numberOfCharacters +
                '}';
    }
}


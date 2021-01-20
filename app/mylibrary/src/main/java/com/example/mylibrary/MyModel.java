package com.example.mylibrary;

public class MyModel {
        private String title, category ,thumbnailUrl;

        public MyModel() {
        }
        public MyModel(String title, String category, String thumbnailUrl) {
            this.title=title;
            this.category=category;
            this.thumbnailUrl = thumbnailUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getThumbnailUrl() {
            return thumbnailUrl;
        }

        public void setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
        }
}

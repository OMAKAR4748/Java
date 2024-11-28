package com.xworkz.shop.Application;

import java.util.Date;

import java.util.Date;
public class Application1DTO {
        private int id;
        private String name;
        private float version;
        private String size;
        private int ratings;
        private int noOfDownloads;
        private String companyName;
        private String feedback;
        private Date releaseDate;
        private Date updatedDate;


        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public float getVersion() {
            return version;
        }

        public String getSize() {
            return size;
        }

        public int getRatings() {
            return ratings;
        }

        public int getNoOfDownloads() {
            return noOfDownloads;
        }

        public String getCompanyName() {
            return companyName;
        }

        public String getFeedback() {
            return feedback;
        }

        public Date getReleaseDate() {
            return releaseDate;
        }

        public Date getUpdatedDate() {
            return updatedDate;
        }



        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setVersion(float version) {
            this.version = version;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setRatings(int ratings) {
            this.ratings = ratings;
        }

        public void setNoOfDownloads(int noOfDownloads) {
            this.noOfDownloads = noOfDownloads;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public void setFeedback(String feedback) {
            this.feedback = feedback;
        }

        public void setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
        }

        public void setUpdatedDate(Date updatedDate) {
            this.updatedDate = updatedDate;
        }

    @Override
    public String toString() {
        return "Application1DTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", version=" + version +
                ", size='" + size + '\'' +
                ", ratings=" + ratings +
                ", noOfDownloads=" + noOfDownloads +
                ", companyName='" + companyName + '\'' +
                ", feedback='" + feedback + '\'' +
                ", releaseDate=" + releaseDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}

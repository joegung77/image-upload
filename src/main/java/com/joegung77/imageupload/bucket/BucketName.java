package com.joegung77.imageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("joegung77-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}

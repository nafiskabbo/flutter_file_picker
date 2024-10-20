package com.mr.flutter.plugin.filepicker;

import android.net.Uri;

import java.util.HashMap;

public class FileInfo {

    final String path;
    final String absolutePath;
    final String name;
    final Uri uri;
    final long size;
    final byte[] bytes;

    public FileInfo(String path, String absolutePath, String name, Uri uri, long size, byte[] bytes) {
        this.path = path;
        this.absolutePath = absolutePath;
        this.name = name;
        this.size = size;
        this.bytes = bytes;
        this.uri = uri;
    }

    public static class Builder {

        private String path;
        private String absolutePath;
        private String name;
        private Uri uri;
        private long size;
        private byte[] bytes;

        public Builder withPath(String path){
            this.path = path;
            return this;
        }

        public Builder withAbsolutePath(String absolutePath){
            this.absolutePath = absolutePath;
            return this;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withSize(long size){
            this.size = size;
            return this;
        }

        public Builder withData(byte[] bytes){
            this.bytes = bytes;
            return this;
        }

        public Builder withUri(Uri uri){
            this.uri = uri;
            return this;
        }

        public FileInfo build() {
            return new FileInfo(this.path, this.absolutePath, this.name, this.uri, this.size, this.bytes);
        }
    }


    public HashMap<String, Object> toMap() {
        final HashMap<String, Object> data = new HashMap<>();
        data.put("path", path);
        data.put("absolutePath", absolutePath);
        data.put("name", name);
        data.put("size", size);
        data.put("bytes", bytes);
        data.put("identifier", uri.toString());
        return data;
    }
}

package com.jy645.joblisting.repository;

import com.jy645.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
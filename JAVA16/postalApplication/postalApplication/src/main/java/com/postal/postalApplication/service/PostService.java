package com.postal.postalApplication.service;

import com.postal.postalApplication.output.PostOfficeResponseBean;

public interface PostService {

    PostOfficeResponseBean fetchPostOfficeDetailsbyCity(String city);
}

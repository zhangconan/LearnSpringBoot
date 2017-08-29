package com.zkn.learnspringboot.web.controller;

import com.zkn.learnspringboot.domain.ProfileDomain;
import com.zkn.learnspringboot.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zkn on 2017/8/29.
 */
@RestController
public class ProfileController {

    @Autowired
    private ProfileDomain profileDomain;
    @Autowired
    private ProfileService profileService;

    @RequestMapping("testProfile")
    public ProfileDomain testProfile() {

        return profileDomain;
    }

    @RequestMapping("testProfile2")
    public String testProfile2() {

        return profileService.getProfileDomain();
    }
}

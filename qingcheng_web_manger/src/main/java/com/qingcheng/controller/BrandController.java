package com.qingcheng.controller;

import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/brand")
public class BrandController {
    //注入远程的服务接口用 @Reference，注入本地的用@autowared
    @Reference
    private BrandService brandService;
    @GetMapping("/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }
}

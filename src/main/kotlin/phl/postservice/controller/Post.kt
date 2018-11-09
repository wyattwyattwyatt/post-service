package phl.postservice.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import phl.postservice.model.Post
import phl.postservice.model.PostRepo


@RestController("api/v1/post")
class PostController {

    @Autowired
    lateinit var postRepo: PostRepo

    @GetMapping("/hello")
    fun hello():String{
        return "hello world"
    }

    @GetMapping
    fun getAll():List<Post>{
        return postRepo.findAll()
    }



}

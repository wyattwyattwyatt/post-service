package phl.postservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*



interface PostRepo: MongoRepository<Post,UUID>

class Post(@Id val postId:UUID,
                val titel:String,
                val text:String)
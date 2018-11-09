package phl.postservice.graphqlResolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import phl.postservice.model.Post
import java.util.*


@Component
class Query: GraphQLQueryResolver{

    
    fun version() = "0.0.1-SNAPSHOT"

}
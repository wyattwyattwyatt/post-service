package phl.postservice.graphqlResolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import phl.postservice.model.Post

class PostResolver: GraphQLQueryResolver{

    fun recentPosts(count: Int,offset: Int):MutableList<Post>{

        var list = ArrayList<Post>()

        return list

    }

}
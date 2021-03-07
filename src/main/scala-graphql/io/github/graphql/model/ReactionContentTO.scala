package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object ReactionContentTO extends Enumeration {

    type ReactionContentTO = Value

    val CONFUSED: Value = Value("CONFUSED")
    val EYES: Value = Value("EYES")
    val HEART: Value = Value("HEART")
    val HOORAY: Value = Value("HOORAY")
    val LAUGH: Value = Value("LAUGH")
    val ROCKET: Value = Value("ROCKET")
    val THUMBS_DOWN: Value = Value("THUMBS_DOWN")
    val THUMBS_UP: Value = Value("THUMBS_UP")

}

class ReactionContentTOTypeRefer extends TypeReference[ReactionContentTO.type]

package com.example.exam_five

class Feed {
    var stories: ArrayList<Story> = ArrayList()
    var post: Post? = null

    constructor(stories: ArrayList<Story>){
        this.stories = stories
    }
    constructor(post: Post){
        this.post = post
    }
}
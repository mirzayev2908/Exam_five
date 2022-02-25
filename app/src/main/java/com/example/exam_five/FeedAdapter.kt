package com.example.exam_five

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FeedAdapter(var context: Context, var feeds: ArrayList<Feed>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object{
        var TYPE_STORIES = 1
        var TYPE_POSTS = 2
    }

    override fun getItemCount(): Int {
        return feeds.size
    }

    override fun getItemViewType(position: Int): Int {
        val feed = feeds[position]
        return if (feed.stories.size > 0) TYPE_STORIES
        else TYPE_POSTS
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_STORIES){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story,parent,false)
            return StoryViewHolder(context,view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feed = feeds[position]

        if (holder is StoryViewHolder){
            apply {
                refreshAdapter(feed.stories,holder.recyclerView)
            }
        }
        if (holder is PostViewHolder){
            apply {
                holder.iv_post.setImageResource(feed.post!!.iv_post)
                holder.tv_resName.text = feed.post!!.tv_resName
                holder.tv_info.text = feed.post!!.tv_info
            }
        }
    }

    fun refreshAdapter(stories: ArrayList<Story>, recyclerView: RecyclerView){
        val adapter = StoryAdapter(context,stories)
        recyclerView.adapter = adapter
    }

    class StoryViewHolder(context: Context, view: View): RecyclerView.ViewHolder(view){
        var recyclerView: RecyclerView

        init {
            recyclerView = view.findViewById(R.id.recyclerView)
            val manager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
            recyclerView.layoutManager = manager
        }
    }
    class PostViewHolder(view: View): RecyclerView.ViewHolder(view){
        var iv_post: ImageView
        var tv_resName: TextView
        var tv_info: TextView

        init {
            iv_post = view.findViewById(R.id.iv_post)
            tv_resName = view.findViewById(R.id.tv_resName)
            tv_info = view.findViewById(R.id.tv_info)
        }
    }

}
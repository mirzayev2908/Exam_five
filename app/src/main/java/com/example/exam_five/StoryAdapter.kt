package com.example.exam_five

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(var context: Context, var stories: ArrayList<Story>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return stories.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story_view,parent,false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var story = stories[position]

        if (holder is StoryViewHolder){
            apply {
                holder.photo.setImageResource(story.photo)
                holder.text.setText(story.text_st)
            }
        }
    }

    class StoryViewHolder(view: View): RecyclerView.ViewHolder(view){
        var photo: ImageView
        var text: TextView

        init {
            photo = view.findViewById(R.id.iv_story)
            text = view.findViewById(R.id.tv_story)
        }
    }
}
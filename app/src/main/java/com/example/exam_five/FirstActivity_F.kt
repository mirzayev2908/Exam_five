package com.example.exam_five

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstActivity_F: Fragment() {

    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first_activity,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }



    fun initViews(view: View){

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(context,2))

        refreshAdapter(getAllFeeds())
    }

    fun refreshAdapter(feeds: ArrayList<Feed>){
        val adapter = FeedAdapter(requireContext(),feeds)
        recyclerView.adapter = adapter
    }

    fun getAllFeeds(): ArrayList<Feed>{
        val stories: ArrayList<Story> = ArrayList()

        stories.add(Story(R.drawable.im_5,"Restaurants"))
        stories.add(Story(R.drawable.im_5,"Coffee shops"))
        stories.add(Story(R.drawable.im_5,"Shopping"))
        stories.add(Story(R.drawable.im_5,"Sport centers"))
        stories.add(Story(R.drawable.im_5,"Gaming club"))
        stories.add(Story(R.drawable.im_5,"Night clubs"))

        val feeds: ArrayList<Feed> = ArrayList()
        feeds.add(Feed(stories))

        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))
        feeds.add(Feed(Post(R.drawable.mealmeal,"Gamine","1231 Fillmore St")))


        return feeds
    }

}
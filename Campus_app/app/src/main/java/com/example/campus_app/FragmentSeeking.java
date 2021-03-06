package com.example.campus_app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sony on 2017/4/21.
 */

public class FragmentSeeking extends ListFragment {
    private View view;
    private ListView list;
    private SimpleAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        list = (ListView) view.findViewById(R.id.lv_content);
//        if (view == null) {// 优化View减少View的创建次数
//           view = inflater.inflate(R.layout.frag_sale, null);
//            return view;
//        }
//        return view;
        view = inflater.inflate(R.layout.frag_sale, container, false);
        list = (ListView) view.findViewById(android.R.id.list);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] listItem = { "a", "b", "c", "d", "e" };
        int[] iconItem = { R.drawable.ic_menu_camera, R.drawable.ic_menu_camera,
                R.drawable.ic_menu_camera, R.drawable.ic_menu_camera,
                R.drawable.ic_menu_camera };
        adapter = new SimpleAdapter(getActivity(), getData(listItem, iconItem),
                R.layout.detail, new String[] { "name", "icon" },
                new int[] { R.id.username, R.id.usericon });
        setListAdapter(adapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

    }

    private List<? extends Map<String, ?>> getData(String[] strs, int[] icon) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < 5; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", strs[i]);
            map.put("icon", icon[i]);
            list.add(map);

        }

        return list;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }
}

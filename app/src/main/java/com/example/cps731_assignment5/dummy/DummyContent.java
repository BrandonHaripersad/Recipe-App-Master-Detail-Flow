package com.example.cps731_assignment5.dummy;

import com.example.cps731_assignment5.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();
    // private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1", "Butter Chicken", "Lorem", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.", R.drawable.butter));
        addItem(new DummyItem("2", "Chicken Brest", "Lorem", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.", R.drawable.chickenbrest));
        addItem(new DummyItem("3", "Pizza", "Lorem", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.", R.drawable.pizza));
        addItem(new DummyItem("4", "Salad", "Lorem", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.", R.drawable.salad));
        addItem(new DummyItem("5", "Chicken Tacos", "Lorem", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.", R.drawable.taco));
        // Add some sample items.
        // for (int i = 1; i <= COUNT; i++) {
            // addItem(createDummyItem(i));
        }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

   // private static DummyItem createDummyItem(int position) {
   //     return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position), image);
   // }

  //  private static String makeDetails(int position) {
   //     StringBuilder builder = new StringBuilder();
   //     builder.append("Details about Item: ").append(position);
   //     for (int i = 0; i < position; i++) {
  //          builder.append("\nMore details information here.");
   //     }
    ///    return builder.toString();
   // }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public String details;
        public String rec;
        public Integer image;

        public DummyItem(String id, String content, String details, String rec, Integer image) {
            this.id = id;
            this.content = content;
            this.rec = rec;
            this.image = image;
            this.details = details;
        }


        @Override
        public String toString() {
            return content;
        }
    }
}
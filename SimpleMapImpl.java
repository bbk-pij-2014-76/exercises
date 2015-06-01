 public class SimpleMapImpl implements SimpleMap
    {
        private final Integer key;
        private String name;

        SimpleMapImpl (Integer k, String n)
        {
            key = k;
            name = n;
        }
        /**
         * Puts a new String in the map.
         *
         * If the key is already in the map, nothing is done.
         */
        public void put(int key, String name)
        {

        }
        /**
         * Returns the name associated with that key,
         * or null if there is none.
         */
        public String get(int key)
        {
            return null;
        }
        /**
         * Removes a name from the map. Future calls to get(key)
         * will return null for this key unless another
         * name is added with the same key.
         2*/
        public void remove(int key)
        {

        }
        /**
         * Returns true if there are no workers in the map,
         * false otherwise
         */
        public boolean isEmpty()
        {
            return false;
        }


}

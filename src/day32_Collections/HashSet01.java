package day32_Collections;

import java.util.HashSet;

public class HashSet01 {
    /*
    A hash is a function that converts one value to another.
    Hashing data is a common practice in computer science and is used for several different purposes.
    Examples include cryptography, compression, checksum generation, and data indexing.
    Hashing is a natural fit for cryptography because it masks the original data with another value.
    A hash function can be used to generate a value that can only be decoded by looking up the value from a hash table.
    The table may be an array, database, or other data structure.
    A good cryptographic hash function is non-invertible, meaning it cannot be reverse engineered.

     */
    public static void main(String[] args) {
        /*
        Random order
        One null is accepted
        Speed is fast

         */

        HashSet<String>hs=new HashSet<>();
        hs.add("Aras");
        hs.add("Tulpar");
        hs.add("Banu");
        hs.add("Efe");
        hs.add("Ege");
        //System.out.println(hs);
        hs.add(null);
        //System.out.println(hs);
        hs.add("Ege");
        //System.out.println(hs);
        Object newHash=hs.clone();
        System.out.println(newHash);

    }
}

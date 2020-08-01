package org.maktab.randomchar;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomChar {

    private TreeSet<Character> treeset = new java.util.TreeSet<>();
    private TreeSet<Character> treeset1 = new java.util.TreeSet<>();

    public TreeSet<Character> getTreeset() {
        return treeset;
    }

    public TreeSet<Character> getTreeset1() {
        return treeset1;
    }

    public void setTreeset(TreeSet<Character> treeset) {
        this.treeset = treeset;
    }

    public void setTreeset1(TreeSet<Character> treeset1) {
        this.treeset1 = treeset1;
    }

    private void initialTreeSet() {

        Random r = new Random();
       while (!(treeset.size()==10&&treeset1.size()==10)){
           if (treeset.size()<=10){
            char c=(char) (r.nextInt(26) + 'a');
            treeset.add(c);

           }else ;
         if (treeset1.size()<=10) {
             char c1 = (char) (r.nextInt(26) + 'a');
             treeset1.add(c1);

         }

        }
    }
    public Set<Character> ejtema(TreeSet<Character> treeSet, TreeSet<Character> treeset1){
        Set<Character> set=new HashSet<>();
        for (Character c:treeSet) {
            set.add(c);
        }
        for (Character c:treeset1) {
            set.add(c);
        }
        return set;

    }
    public Set<Character> eshterac(TreeSet<Character> treeset,TreeSet<Character> treeset1){
        Set<Character> set=new HashSet<>();
        Set<Character> setEshterac=new HashSet<>();
        for (Character c:treeset
             ) {
            set.add(c);
        }
        for (Character c:treeset1
             ) {
            if (set.contains(c))setEshterac.add(c);
        }
        return setEshterac;

    }

    public static void main(String[] args) {
        RandomChar treeSet = new RandomChar();
        treeSet.initialTreeSet();
        System.out.println("First tree set : "+treeSet.getTreeset());
        System.out.println("Second tree set : "+treeSet.getTreeset1());
        System.out.println("Ejtema : "+treeSet.ejtema(treeSet.getTreeset(),treeSet.getTreeset1()));
        System.out.println("Eshterac : "+treeSet.eshterac(treeSet.getTreeset(),treeSet.getTreeset1()));


    }
}

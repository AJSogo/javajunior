package lesson14.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class CollectionUtils implements ICollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> dub = new LinkedList<>();
        for (int i = 0; i < a.size(); i++ ) {
            //dub.add(();

        }

        return null;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }
}

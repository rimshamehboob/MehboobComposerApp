package com.Mehboob;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao{

    private List<Composer> composers = new ArrayList<Composer>(5);

    public MemComposerDao()
    {
        composers.add(new Composer(1,"messi","psg"));
        composers.add(new Composer(1,"ronaldo","man-u"));
        composers.add(new Composer(1,"martinez","man-u"));
        composers.add(new Composer(1,"pogba","juventus"));
        composers.add(new Composer(1,"gundogan","city"));
    }

    /**
     * Returns all composer objects
     */
    @Override
    public List<Composer> findAll() {
        
        return this.composers;
    }

    /**
     * Returns a composer matching a specific ID
     */
    @Override
    public Composer findBy(Integer key) {
        Composer returnValue = null;
        for(Composer comp:this.composers)
        {
            if (comp.getId() == key)
            {
                returnValue = comp;
            }
            
        }
        return returnValue;
        
    }

    /**
     * Adds a new composer object to the list of composers
     */
    @Override
    public void insert(Composer entity) {
        
        this.composers.add(entity);
    }

    
    
}

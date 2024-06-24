package inheritance;

interface grandparent{

}

interface Mom extends grandparent{

}

interface Dad extends grandparent{
    
}

class Child implements Mom,Dad{

}

//not possible in java due to error of ambiguity it forms a looping condition

//containing one multiple and single,multilevel, and hierarchical

public class hybrid {
    
}

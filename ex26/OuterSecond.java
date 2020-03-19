package t_10_innerClasses.ex26;

import t_10_innerClasses.ex26.OuterFirst.Inner;

public class OuterSecond extends Inner {

    public OuterSecond(OuterFirst outerFirst, int a, int b)
    {
        outerFirst.super(a, b);
    }

}

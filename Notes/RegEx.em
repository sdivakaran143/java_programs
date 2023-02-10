<RegEx/>-Regular Expression


<!NOTE:>

        #we can write a pattern macher in one line like this :    
            -  Matcher mach=Pattern.compile("[^a-zA-Z0-9]").matcher(str);
        
        #character class can be defined with in the [square brackets]

        #

>--------------------------------------------------------------------------------------------------------------------------------<

<Introduction>
        Basic Syntaxt(Java):
                Pattern p = Pattern.compile("a*b");
                Matcher m = p.matcher("aaaaab");
                boolean b = m.matches();

        there are three claess inbn the regex  package 
            =>Pattern
                it compiles the string to RegEx (pattern)
                which means it converts the string that the compiler can understood  
            =>Matcher
                it matches the pattern
            =>patternSyntaxtException
                    its works when there is an error  while working on pattern and matcher class 

>--------------------------------------------------------------------------------------------------------------------------------<

<Partten>
    in java we can't create the class likie this 

            /*Pattern ptrn =new pattern();*/

                    because it calls the Pattern class's constructor but
                    the Pattrern class constructer is private constructor so we can call the pattern class constructor
                    (private Constructor - the constructor only can call with in the class) 
                    we can't create the object for this pattern class this type of activites is known as singleton pattern 
        
        okay!... how can we use pattern without object 

                    there is an mettod in pattern class called compile() we can us e it like...

                        pattern ptrn =Pattern.compile("ello")
                                                        L->"PATTERN TO IDENTIFY IS IT IS AVAILABLE ???"

>--------------------------------------------------------------------------------------------------------------------------------<

<Matcher>
    the Matcher class is used to find the match of the string with thye pattern 

                Syntaxt:
                    Matcher mchr=ptr.matcher("haello hello sir")

    in the matcher class there is the the method called find() and group(), the find() method findes the matches in string
    if it is find it returns the true otherwise it returns false 

            m.find() => it attempts to find the pattern is matches in pattern
            m.group() => method RETURNS  the matched pattern in the matcher string  
            m.starts()=> this method returns the stating index value of the each matched machers string 
            m.end()   => this method returns the ending index value of the mached machers string 
                like...:

                    while (m.find()){
                        System.out.println(m.group()+" => "+m.start());
                    }
        
            (^regex)  => refers start(caret Symbol)
                            ~it check the given matcher is begains with the pattern 
            (regex$)  => refers end (Dollar symbol)
                            ~it check the given matcher is ends with the pattern
        (regex|regex) => refers or (pipe Symbol) 
                            ~it checks the given matcher contains T|R (T or R) in the string 
>--------------------------------------------------------------------------------------------------------------------------------<

<Character Class>                                           

            character class can be defined with in the [square brackets]

            for example :
                matcher mtchr =ptrn.matches("abcdabababacccdababab");
                pattern ptrm =Pattern.compile("[abc]");
                                              L-> it means (a|b|c)

            "[abc]"         =>a|b|c (either or)
            "[^ab]"         =>except a and b (except)
            "[a-zA-Z]"   =>a to z (small) or A to Z (capital)
            "[0-9]"         =>0 to 9

>--------------------------------------------------------------------------------------------------------------------------------<

<PreDefined Classes> <metta character classes>
        we can use \s because in java \character (slash) is represent as a escape characters so in predefined classes uses \\character (Double-slash)
            
            \\s => refered as a Space (it takes only space )(space)
            \\S => refered as except space (it takes except spaces)(Non Space)
            \\d => refered as digits (returns only numbers)(Numbers)
            \\D => refered as except digits (it returns except numbers)(non numbers)
            \\w => refered as word (alpanumeric) except special characters 
            \\W => except word (except alpanumeric) only special characters 
            \\b => refered as Word boundry (its returns the word ) \\btamil start with tamil
            \\bhello\\b => it takes only thye word contains hello it doesn't take (helloit or hellos) but (\\bhello takes)
                           \\btamil\\b start and end with tamil
            \\Btamil=>it does'nt work or didn't do noyhing  
            \\Btamil\\B=>it does'nt work or didn't do noyhing  
            tamil\\B=>it takes only the word does not end with tamil it takes tamilan ,tamilnadu,tamila
            \\G => it search the pattern on the end of the previous match or search (like hellohello) (Group)
            "." => it takes all including all chareacters,numbers,specalcharacters

>--------------------------------------------------------------------------------------------------------------------------------<
refer : "https://www.youtube.com/watch?v=tNAFztV_meE"
<Quatufiers>
        quantifiers refers as a quantity or number of occurence 

        quatifieres contains 4 Symbols ( ? , * , + , {} )

            ( + ) => indicates atleast 1 match  maximum n matches 
                    for example :"ab+"
                        ab abb abbb abbb ab ab
                    example :"a+"
                        a a aa aaa aa a 

            ( * ) => indicates any number of match even it is 0
                    for example:"a*"
                        a _ aa _ aaa _ a _ a _ a _ aa _ a
                        (_ refers empty value  the macher is abaabaaababababaaba)
                        if there is no "a" (its b means) it leave as empty only it takes a otherwise leave it as empty

             ( ? ) => it search for only one match if it is found it search for next match 
                    for example:"a?"
                        a _ a _ a _ _ a _ _ _ a _ a  _a _ a
                        it also show there is not a match (_)

             ( {} ) => it search for the fixed value of "a" was there 
                    for example:"a{2}"
                        aa aa aa aa  

                        it check ther is contibnue of 2 a's if "a{3}" it checks there is continue of 3 a's
             
             ( a{1,3} ) => it search for a occurs 1 to 3 time 
                    for example : "a{1,3}"
                        a aa  a  aaa aa a aaa
                        it gives continues of a's   1 to 3 in the matcher 

<split,string>
            split("\\s") => split by space 
            split("\\.") => split by dot 

        String[] stra=Pattern.compile("a").split(str);
            output:
            div
            k
            r
            n from.p
            r
            m

        we can use the regx in two ways
        String[] strarr=str.split("\\.");
        String[] stra=Pattern.compile("\\.").split(str);
        the both are common the both method are stored in string arr[] 

>--------------------------------------------------------------------------------------------------------------------------------<
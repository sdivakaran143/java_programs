<RegEx/>-Regular Expression


<!NOTE:>

        #we can write a pattern macher in one line like this :    
            -  Matcher mach=Pattern.compile("[^a-zA-Z0-9]").matcher(str);
        
        #character class can be defined with in the [square brackets]

        # StringTokenizer is a legacy class (legacy class means the class is comming along with the JDK 1.0 to till now)

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
            split("\\-") => split by Minus
            split("\\specialcharacter") => split by specialcharacters where ever it is   

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
<String Tokenizer class>

        string tokenizer is the one of the package of the java.util.stringTokenizer\\
        
        => stringTokenizer breakes the string into tokens 
            if you need to use stringTokenizer you need to use the constructor
            we usually knows that if we creates the object it automatically calls the constructor 
        
        we can create a object like ...
         StringTokenizer str = new StringTokenizer();
                                            L->  while typing this in vscode presc ctrl+space to know about the constructors
                                            there are three types of constructors 
                                                Type 1 # StringTokenizer(String)
                                                Type 2 # StringTokenizer(String,String)
                                                Type 3 # StringTokenizer(String,String,boolean)
        
        for example:
            StringTokenizer strizer =new StringTokenizer("divakaran from paramathi velur");

        [NOTE : => 
            strizer.countTokens()=> it returns how torkens are there (that means breaked torkens)
            strizer.hasMoreToken()=> retuns boolean value it checks there is torken or not (we use this in while loop)
            strizer.nexttoken()=> it returns the token 
        ]

        NOTE : 
            how it splits by the space?
                => in this StringTokenizer  its splits by the delimiter ," "(space) is a default delimiters in StringTokenizer  

        --------------------------------------------------------------------------------------------------------------        
        TYPE 1 Constructor: 
            StringTokenizer strizer =new StringTokenizer("divakaran from paramathi velur");
                                                                  L-> string 
            System.out.println(strizer.countTokens());
            //it outputs :  4
        --------------------------------------------------------------------------------------------------------------        
        TYPE 2 Constructor:

            StringTokenizer strizer =new StringTokenizer("www.sdivakaran143.com",".");
                                                           L-> string             L->String(delimiters)
            while(strizer.hasMoreToken()){
                    System.out.println(strizer.nextTorken());
            }

            //output :
                www
                sdivakaran143
                com
        --------------------------------------------------------------------------------------------------------------        
        TYPE 3 Constructor:
                                                                                      |-> boolean (it indicates that the delimeter is counted or not )
            StringTokenizer strizer =new StringTokenizer("www.sdivakaran143.com",".",true);
                                                           L-> string             L->String(delimiters)

            parameter three : it a boolean trhatv soecifies that the delimeter is included or not                                              

            StringTokenizer strizer3 =new StringTokenizer("www.sdivakaran143.com",".",true);

            if the thrid parameters is true the ouput be like :
            
                    //ouput:(parameter3:true)               |      //ouput:(parameter3:false)      
                                    www                     |              www       
                                    .                       |              sdivakaran143       
                                    sdivakaran143           |              com       
                                    .                       |                     
                                    com                     |                   
                                                            |   
>--------------------------------------------------------------------------------------------------------------------------------<
<StringTokenizer vs Split()>
    
    => the split() belongs to the String class

        the STringTokenizers is completely similar to the split()
        split method is easy to use becz insted of creating object and more methods

        there is an a beautiful power is in the split() method

        NOTE: in string "http://www.sdivakaran143.com" we need to split on (:,//,.)=>delimiters 
            -> in StringTokenizer it is hard to do it we need to create the object for individual delimiters
            -> but in split() method it is so easy to do that 

        we use like this :
                    str.split("\\:|\\.|\\\\");
                    \\outputs 
                        http

                        www
                        sdivakaran143
                        com
>--------------------------------------------------------------------------------------------------------------------------------<

<Conclusion|end>

        NOTE : 
            1)why StringTokenizer is in java ? 
            2)so why we using the stringTokenizer?
            3)split() method is aldredy there to do this same job... 
                    1-> refer the (line 11 ) and continue here 
                    2,3-> split method can perform the same operation but we can't see what the delimiter is used for spliting
                       in StringTokenizer there is a constructor (constructor type 3) to saw what  delimeter is used for spliting 
                       (it also shows the delimeter) some time its use for backward compatability applications 

        we can use the split() method instead of StringTokenizer  


>=================================================================================================================================<

<Activities>
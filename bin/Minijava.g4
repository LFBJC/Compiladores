grammar Minijava;

program: MainClass (ClassDecl)* EOF;


/* classes */

MainClass:
          'class' Identifier '{'
              'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{'
                      Statement 
              '}' 
            '}'
          ;

ClassDecl:
        'class' Identifier ('extends' Identifier)? '{' (VarDecl)* (MethodDecl)* '}'
        ;
        
/*variaveis e tipos */
VarDecl:
		Type Identifier ';'
		;
Type:
		'int' '[' ']'
		|'boolean'
		|'int'
		|Identifier
		;        
/*metodos*/

MethodDecl:
        'public' Type Identifier '(' (Type Identifier (',' Type Identifier)* )? ')' '{' (VarDecl)* (Statement)* 'return' Exp '}'
        ;
        
        
/*statements*/

Statement:
		'{' ( Statement )* '}'
		| 'while' '(' Exp ')' '{' Statement '}'
        | 'if' '(' Exp ')' '{' Statement '}' 'else' '{' Statement '}'
        | 'System.out.println' '(' Exp ')' ';'
        | Identifier '=' Exp ';'
        | Identifier '[' Exp ']' '=' Exp ';'
        ;

        
/* Expressoes */
Exp:
		| INTEGER_LITERAL Exp_remainer
		| 'true' Exp_remainer
		| 'false' Exp_remainer
		| Identifier Exp_remainer
		| 'this' Exp_remainer
		| 'new' 'int' '[' Exp ']' Exp_remainer
		| 'new' Identifier '(' ')' Exp_remainer
		| '!' Exp Exp_remainer
		| '(' Exp ')' Exp_remainer
		;
Exp_remainer:
		( '&&' | '<' | '+' | '-' | '*' ) Exp
		| '[' Exp ']'
		| '.' 'length'
		| '.' Identifier '(' ( Exp ( ',' Exp )* )? ')'
		|
		;


Identifier: IDENTIFIER;

/* CTES */
IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9];
INTEGER_LITERAL: [0-9]*;
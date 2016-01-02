ClassRef : '$K' [0-9]+ '?' [0-9]+ ;
FinalFieldRef : '$D' [0-9]+ '?' [0-9]+ ;
FinalVarRef : '$X' [0-9]+ '?' [0-9]+ ;
CommonFieldRef : '$F' [0-9]+ '?' [0-9]+ ;
CommonVarRef : '$C' [0-9]+ '?' [0-9]+ ;

// for lambda only
NoDeclaredType : AT 'NT' ;
// for hole
CodeHole : AT 'HO' ;

enhancedForStatementNoShortIf
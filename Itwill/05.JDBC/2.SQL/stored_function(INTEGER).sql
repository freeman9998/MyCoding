 CREATE OR REPLACE FUNCTION get_balance( no IN NUMBER ,name IN VARCHAR2 )
 RETURN NUMBER
 IS
     balance NUMBER;
 BEGIN  
    SELECT acc_balance INTO balance 
    FROM accountA
    WHERE acc_no = no; 
    RETURN (balance); 
 END;
  

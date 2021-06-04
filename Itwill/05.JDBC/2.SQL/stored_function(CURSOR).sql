CREATE OR REPLACE PACKAGE types 
	AS TYPE cursorType 
	IS REF CURSOR;
END;
/ 

CREATE OR REPLACE FUNCTION list_balance
RETURN types.cursorType
IS  
acc_cursor types.cursorType;
BEGIN
OPEN acc_cursor FOR
      SELECT *  
      FROM ACCOUNTA;
      RETURN(acc_cursor);
END; 
/ 

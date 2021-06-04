--student +address
select stud_id, name, email,phone, a.addr_id, street, city, state, zip, country
  		FROM students s 
      left outer join addresses a 
      on s.addr_id=a.addr_id;
  
select stud_id, name, email,phone, a.addr_id, street, city, state, zip, country
  		FROM students s 
      right outer join addresses a 
      on s.addr_id=a.addr_id;    
      
select stud_id, name, email,phone, a.addr_id, street, city, state, zip, country
  		FROM students s 
      full outer join addresses a 
      on s.addr_id=a.addr_id;   
--student(stu_id = 1) + address 
select stud_id, name, email,phone, a.addr_id, street, city, state, zip, country
  		FROM students s 
      full outer join addresses a 
      on s.addr_id=a.addr_id
      where s.stud_id=1;
--student + address (address_id = 3)
select stud_id, name, email,phone, a.addr_id, street, city, state, zip, country
  		FROM students s 
        left outer join addresses a 
        on s.addr_id=a.addr_id
        where a.addr_id=3;
      
--tutor + course 
SELECT t.tutor_id, t.name as tutor_name, email,course_id, c.name, description, start_date, end_date
      FROM tutors t 
      full outer join courses c 
      on t.tutor_id=c.tutor_id;
      
--tutor + course (tutor_id = 1)      
SELECT t.tutor_id, t.name as tutor_name, email,course_id, c.name, description, start_date, end_date
      FROM tutors t 
      full outer join courses c 
      on t.tutor_id=c.tutor_id
      where t.tutor_id=1;  
      
--tutor + course (course_id = 1)      
SELECT t.tutor_id, t.name as tutor_name, email,course_id, c.name, description, start_date, end_date
      FROM tutors t 
      full outer join courses c 
      on t.tutor_id=c.tutor_id
      where c.course_id=1; 

--tutor + address + course
SELECT t.tutor_id, t.name as tutor_name, email, a.addr_id, street, city, state, zip, country,
       course_id, c.name, description, start_date, end_date
      FROM tutors t 
      left outer join addresses a 
      on t.addr_id=a.addr_id
      left outer join courses c on t.tutor_id=c.tutor_id;
--tutor(tutor_id=1) + address + course          
SELECT t.tutor_id, t.name as tutor_name, email, a.addr_id, street, city, state, zip, country,
       course_id, c.name, description, start_date, end_date
      FROM tutors t 
      left outer join addresses a 
      on t.addr_id=a.addr_id
		  left outer join courses c on t.tutor_id=c.tutor_id
      where t.tutor_id=1;      
--tutor + address + course(course_id = 1)           
SELECT t.tutor_id, t.name as tutor_name, email, a.addr_id, street, city, state, zip, country,
       course_id, c.name, description, start_date, end_date
      FROM tutors t 
      left outer join addresses a 
      on t.addr_id=a.addr_id
		  left outer join courses c on t.tutor_id=c.tutor_id
      where c.course_id=1;   
     
--tutor + address(addr_id = 3) + course           
SELECT t.tutor_id, t.name as tutor_name, email, a.addr_id, street, city, state, zip, country,
       course_id, c.name, description, start_date, end_date
      FROM tutors t 
      left outer join addresses a 
      on t.addr_id=a.addr_id
      left outer join courses c on t.tutor_id=c.tutor_id
      where a.addr_id=1;        
  
      
      
      
      
      
      
           
      
      
      
      
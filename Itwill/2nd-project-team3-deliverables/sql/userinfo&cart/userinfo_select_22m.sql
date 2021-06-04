--rollback
--한명의 유저 찾기
select * from userinfo where user_id= #{user_id}

--한명의 유저 업데이트
update userinfo set password = #{password},
                            user_address= #{user_address},
                            user_phone= #{user_phone},
                            email= #{email}
where
user_id= #{user_id}
                            
--한명 유저 탈퇴
delete userinfo where user_id = #{user_id}



    
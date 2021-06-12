import React, { Component } from 'react'
import {Form,Button} from 'react-bootstrap';
import { NavLink } from 'react-router-dom';

class Body extends Component{
    Login = () => {
        alert("로그인 되셨습니다.")
        return;
    }

    render(){
        const buttonStyle = {
            marginTop: 10
          };
        return(
            <Form>
                <Button
                style={buttonStyle}
                onClick={this.Login}
                >
                    로그인
                </Button>
            </Form>
            
        )
    }
}

export default Body
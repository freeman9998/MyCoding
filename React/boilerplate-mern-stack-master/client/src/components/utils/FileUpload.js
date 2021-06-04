import React from 'react'
import Dropzone from 'react-dropzone';
import { Icon } from 'antd';
import axios from 'axios';
const headers = {'content-type':'multipart/form-data'}

function FileUpload() {
    const dropHandler = (image) => {

        let formData = new FormData();
        formData.append("image", image[0])

        const send_parm = {
            headers,
            formData
        }



        axios
            .post('/api/product/image',send_parm)
            .then(res=>{
                if (res.data.message) {
                    console.log(res.data.message);

                }else{
                    alert('파일을 저장하는데 실패했습니다.');
                }
            })


    }

    return (
        <div style={{ display: 'flex', justifyContent: 'space-between' }}>
            <Dropzone onDrop={dropHandler}>
                {({ getRootProps, getInputProps }) => (
                    <div
                        style={{
                            width: 300, height: 240, border: '1px solid lightgray',
                            display: 'flex', alignItems: 'center', justifyContent: 'center'
                        }}
                        {...getRootProps()}>
                        <input {...getInputProps()} />
                        <Icon type="plus" style={{fontSize:'3rem'}}/>
                    </div>
                )}
            </Dropzone>
        </div>
    )
}

export default FileUpload

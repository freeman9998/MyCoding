import React from 'react'
import useReactRouter from 'use-react-router'
import { useDispatch } from 'react-redux'
import * as UI from '../utils/material'
import * as Actions from '../modules/common'
import { useTranslation } from 'react-i18next'
import Alert from '@material-ui/lab/Alert'

const Login = () => {
    // const { history, location, match } = useReactRouter()
    const { history } = useReactRouter()
    const { t } = useTranslation()
    const classes = UI.usemakeStyles()
    const dispatch = useDispatch()

    const [params, setParams] = React.useState({
        login_id:'',
        passwd:''
    })

    const [loginCheck, setLoginCheck] = React.useState(false)
    const [msg, setMsg] = React.useState('')

    const handleChange = (e) => {
        const { name, value } = e.target;
        setParams(params => ({ ...params, [name]: value }))
    }

    const handleSubmit = (e) => {
        e.preventDefault();

        if (params.login_id && params.passwd) {
            dispatch(Actions.login(params)).then((data) => {

                console.log(data.resultCode)

                if(data.resultCode === 200) {
                    history.push('/')
                } else {
                    setLoginCheck(true)
                    setMsg(t(`result.${data.resultCode}`))
                }
            })
        }
    }

    const handleEnter = (e) => {
        if(e.charCode === 13) {
            handleSubmit(e)
        }
    }

    return (
        <div className={classes.login_wrapper}>
            <UI.Paper className={classes.login_padding}>
                <div className={classes.login_margin}>
                    <UI.Grid 
                        container
                        spacing={8}
                        alignItems="flex-end"
                    >
                        <UI.Grid item>
                            <UI.Face />
                        </UI.Grid>
                        <UI.Grid
                            item
                            md={true}
                            sm={true}
                            xs={true}
                        >
                            <UI.TextField
                                id="login_id"
                                name="login_id"
                                label={t('id')}
                                type="text"
                                onChange={handleChange}
                                fullWidth autoFocus required/>
                        </UI.Grid>
                    </UI.Grid>
                    <UI.Grid
                        container
                        spacing={8}
                        alignItems="flex-end"
                    >
                        <UI.Grid item>
                            <UI.Fingerprint />
                        </UI.Grid>
                        <UI.Grid
                            item
                            md={true}
                            sm={true}
                            xs={true}
                        >
                            <UI.TextField
                                id="passwd"
                                name="passwd"
                                label={t('password')}
                                type="password"
                                onChange={handleChange}
                                onKeyPress={handleEnter}
                                fullWidth required 
                            />
                        </UI.Grid>
                    </UI.Grid>
                    <UI.Grid container justify="center" style={{ marginTop: '10px' }}>
                        <UI.Button
                            variant="outlined"
                            color="primary"
                            style={{ textTransform: "none" }}
                            onClick={handleSubmit}
                        >{t('login')}</UI.Button>
                    </UI.Grid>
                </div>
            </UI.Paper>
            <UI.Paper className={classes.login_padding}>
                <UI.Collapse in={loginCheck}>
                    <Alert
                        severity="error"
                        action={
                            <UI.IconButton
                            aria-label="close"
                            color="inherit"
                            size="small"
                            onClick={() => {
                                setLoginCheck(false)
                            }}
                            >
                            <UI.Close fontSize="inherit" />
                            </UI.IconButton>
                        }
                    >
                        {msg}
                    </Alert>
                </UI.Collapse>
            </UI.Paper>
        </div>
    )
}

export default Login
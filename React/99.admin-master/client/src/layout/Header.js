import React from 'react'
import * as UI from '../utils/material'
import useReactRouter from 'use-react-router'
import { useTranslation } from 'react-i18next'
import { withStyles } from '@material-ui/core/styles'
import { isWidthUp } from '@material-ui/core/withWidth'

const styles = ({ spacing, transitions, breakpoints, palette, shape }) => ({
    header : {
        fontWeight : 900,
        minWidth   : 0,
        fontSize   : 18
    },
    grow : {
        flexGrow : 1
    }
})

const Header = ({ classes, screen, user }) => {
    const { t, i18n } = useTranslation()
    // const { history, location, match } = useReactRouter()
    const { history } = useReactRouter()
    const [anchorEl, setAnchorEl] = React.useState(null)
    const open = Boolean(anchorEl)

    const handleChangeLang = (country) => {
        setAnchorEl(null)
        i18n.changeLanguage(country)
    }

    return (
        <React.Fragment>
            <UI.Typography noWrap color="primary" className={classes.header}>
            FMS
            </UI.Typography>
            <div className={classes.grow} />
            <UI.IconButton
                aria-controls="lang-appbar"
                aria-haspopup="true"
                onClick={(event) => {
                    setAnchorEl(event.currentTarget)
                }}
                color="inherit"
            >
                <UI.Language/>
            </UI.IconButton>
            <UI.Menu
                id="lang-appbar"
                anchorEl={anchorEl}
                anchorOrigin={{
                vertical: 'top',
                horizontal: 'right',
                }}
                keepMounted
                transformOrigin={{
                vertical: 'top',
                horizontal: 'right',
                }}
                open={open}
                onClose={() => {
                    setAnchorEl(null)
                }}
            >
                <UI.MenuItem onClick={() => handleChangeLang('KR')}>
                    <UI.Typography variant="inherit">{t('korean')}</UI.Typography>
                </UI.MenuItem>
                <UI.MenuItem onClick={() => handleChangeLang('US')}>
                    <UI.Typography variant="inherit">{t('english')}</UI.Typography>
                </UI.MenuItem>
                <UI.MenuItem onClick={() => handleChangeLang('VN')}>
                    <UI.Typography variant="inherit">{t('vietnamese')}</UI.Typography>
                </UI.MenuItem>
            </UI.Menu>

            {user !== null &&
            <UI.IconButton
                aria-label="LogOut"
                aria-controls="logout-appbar"
                aria-haspopup="true"
                onClick={() => {
                    localStorage.removeItem('user')
                    history.push('/')
                }}
                color="inherit"
            >
                <UI.ExitToApp/>
            </UI.IconButton>
            }
            
            {screen === "xs" && (
            <UI.MoreVert/>
            )}
            {screen === "sm" && (
            <React.Fragment>
                <UI.Favorite/>
                <UI.MoreVert/>
            </React.Fragment>
            )}
            {isWidthUp("md", screen) && (
            <React.Fragment>
                <UI.Favorite/>
                <UI.Phone/>
                <UI.Camera/>
            </React.Fragment>
            )}
        </React.Fragment>
    )
}

export default withStyles(styles)(Header)
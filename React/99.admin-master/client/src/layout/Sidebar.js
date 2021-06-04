import React from 'react'
import { Link } from 'react-router-dom'
import * as UI from '../utils/material'
import Menu from './Menu'

const Sidebar = ({menuList}) => {
    const classes = UI.usecreateStyles()

    return (
        <UI.List component="nav" disablePadding>
            <UI.ListItem
                button
                component={Link}
                to="/"
            >
                <UI.ListItemIcon>
                    <UI.Home className={classes.menuItemIcon}/>
                </UI.ListItemIcon>
                <UI.ListItemText primary="Home"/>
            </UI.ListItem>
            <UI.Divider />
            {menuList && menuList.map((rs, idx) => (
            <Menu {...rs} key={idx}/>
            ))}
        </UI.List>
    )
}

export default Sidebar
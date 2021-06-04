import React from 'react'
import * as UI from '../utils/material'
import { Link } from 'react-router-dom'
import { useTranslation } from 'react-i18next'

const Menu = (item) => {
    const { t } = useTranslation()
    const classes = UI.usecreateStyles()
    const [open, setOpen] = React.useState(false)
    const isExpandable = item.sub && item.sub.length > 0

    const handleClick = (e) => {
        setOpen(!open)
    }

    const MenuItem = isExpandable ? (
        <UI.ListItem
          className={classes.menuItem}
          button
          onClick={handleClick}
        >
            <UI.ListItemIcon>
              <UI.LibraryBooks className={classes.menuItemIcon}/>
            </UI.ListItemIcon>
            <UI.ListItemText primary={t(`menu.${item.menu_id}`)}/>
            {isExpandable && !open && <UI.ExpandMore />}
            {isExpandable && open && <UI.ExpandLess />}
        </UI.ListItem>
    ) : (
      <UI.ListItem 
        className={classes.menuItem}
        button
        component={Link}
        to={`/${item.page_url}`}
        onClick={handleClick}
      >
            <UI.ListItemIcon>
              <UI.Remove className={classes.menuItemIcon}/>
            </UI.ListItemIcon>
            <UI.ListItemText primary={t(`menu.${item.menu_id}`)}/>
            {isExpandable && !open && <UI.ExpandMore />}
            {isExpandable && open && <UI.ExpandLess />}
        </UI.ListItem>
    )
  
    const SubMenuItem = isExpandable ? (
        <UI.Collapse in={open} timeout="auto" unmountOnExit>
        <UI.Divider />
        <UI.List component="div" disablePadding>
            {item.sub.map((rs, idx) => (
                <Menu {...rs} key={idx}/>
            ))}
        </UI.List>
        </UI.Collapse>
    ) : null

    return (
        <>
        {MenuItem}
        {SubMenuItem}
        </>
    )
}

export default Menu
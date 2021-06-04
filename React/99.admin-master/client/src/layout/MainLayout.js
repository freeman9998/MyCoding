import React from 'react'
import * as UI from '../utils/material'
import * as Actions from '../modules/common'
import ScreenRoute from '../routes/ScreenRoute'
import { useDispatch, useSelector } from 'react-redux'

import styled from 'styled-components'
import { StylesProvider } from '@material-ui/core/styles'

import {
    Root,
    getHeader,
    getSidebarTrigger,
    getDrawerSidebar,
    getSidebarContent,
    getContent,
} from '@mui-treasury/layout'

import {
    getDefaultScheme,
    getStandardScheme,
} from '@mui-treasury/layout/presets'

import CHeader from './Header'
import CNavHeader from './NavHeader'
import Sidebar from './Sidebar'

const scheme         = getDefaultScheme()
const Header         = getHeader(styled)
const SidebarTrigger = getSidebarTrigger(styled)
const DrawerSidebar  = getDrawerSidebar(styled)
const SidebarContent = getSidebarContent(styled)
const Content        = getContent(styled)

const MainLayout = () => {
    const dispatch = useDispatch()
    const menuList = useSelector((state) => state.data.menu)
    const user = JSON.parse(localStorage.getItem('user'))

    const getList = React.useCallback(() => {
        try {
            dispatch(Actions.select('menu', 'menu', {user_id : user.user_id}))
        } catch(e) {
            console.log("Select Menu List Error="+e)
        }
    }, [dispatch, user.user_id])

    React.useEffect(() => {
        getList()
    }, [getList])

    return (
        <StylesProvider injectFirst>
            <UI.CssBaseline/>
            <Root scheme={scheme}>
            {({ state : { sidebar }}) => (
                <React.Fragment>
                    <Header>
                        <UI.Toolbar>
                            <SidebarTrigger sidebarId="primarySidebar" />
                            <CHeader user={user}/>
                        </UI.Toolbar>
                    </Header>
                    <DrawerSidebar sidebarId="primarySidebar">
                        <SidebarContent>
                            <CNavHeader
                                collapsed={sidebar.primarySidebar.collapsed}
                                user={user}
                            />
                            <Sidebar
                                menuList={menuList}
                            />
                        </SidebarContent>
                    </DrawerSidebar>
                    <Content>
                        <ScreenRoute user={user}/>
                    </Content>
                </React.Fragment>
            )}
            </Root>
        </StylesProvider>
    )
}

export default MainLayout
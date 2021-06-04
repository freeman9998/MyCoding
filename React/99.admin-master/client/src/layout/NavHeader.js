import React from 'react'
import * as UI from '../utils/material'

const NavHeader = ({ collapsed, user }) => (
    <>
    <div style={{ padding: collapsed ? 8 : 16, transition: "0.3s" }}>
      <UI.Avatar
        style={{
          width: collapsed ? 48 : 60,
          height: collapsed ? 48 : 60,
          transition: "0.3s"
        }}
        src={user.img_url}
      />
      <div style={{ paddingBottom: 16 }} />
      <UI.Typography variant={"h6"} noWrap>
        {user.user_name}
      </UI.Typography>
      <UI.Typography color={"textSecondary"} noWrap gutterBottom>
        {user.email_addr}
      </UI.Typography>
    </div>
    <UI.Divider />
    </>
)

export default NavHeader
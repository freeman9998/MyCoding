import {
    makeStyles,
    createStyles,
} from '@material-ui/core/styles'


const drawerWidth = 360

// const transition = {
//   transition: "all 0.33s cubic-bezier(0.685, 0.0473, 0.346, 1)"
// }
/* --------------- */
/* makeStyles      */
/* --------------- */
export const usemakeStyles = makeStyles(theme => (
  {
    root: {
      display: 'flex',
    },
    drawer: {
      [theme.breakpoints.up('lg')]: {
        width: drawerWidth,
        flexShrink: 0,
      },
    },
    appBar: {
      [theme.breakpoints.up('lg')]: {
        width: `calc(100% - ${drawerWidth}px)`,
        marginLeft: drawerWidth,
      },
    },
    menuButton: {
      marginRight: theme.spacing(2),
      [theme.breakpoints.up('lg')]: {
        display: 'none',
      },
    },
    appBarTitle : {
      flexGrow: 1,
    },
    toolbar: theme.mixins.toolbar,
    drawerPaper: {
      width: drawerWidth,
    },
    content: {
      flexGrow: 1,
      padding: theme.spacing(3),
    },
    login_wrapper: {
      position: "relative",
      top: "0",
      // height: "100vh",
      maxHeight: "100%",
    },
    login_margin: {
        // margin: theme.spacing.unit * 2,
        margin: theme.spacing(2),
    },
    login_padding: {
        padding: theme.spacing.unit
    },
    formControl: {
      margin: theme.spacing(1),
      minWidth: 120,
    },
    paper: {
      display:'flex',
      padding: theme.spacing(1),
      // marginRight : theme.spacing(3),
      textAlign: 'center',
      color: theme.palette.text.secondary,
    },
  }
))
/* --------------- */
/* createStyles    */
/* --------------- */
export const usecreateStyles = makeStyles(theme => createStyles(
  {
    menuItem: {
      '&.active': {
        background: 'rgba(0, 0, 0, 0.08)',
        '& .MuiListItemIcon-root': {
          color: '#fff',
        },
      },
    },
    menuItemIcon: {
      color: '#97c05c',
    },
  }
))

import "date-fns"
import React from 'react'
import DateFnsUtils from "@date-io/date-fns"
import { MuiPickersUtilsProvider, KeyboardDatePicker } from "@material-ui/pickers"

const DatePicker = ({value, dateCd, onChange}) => {
    const pikerInfo = {
        'Y' : {
            format : 'yyyy',
            openTo : 'year',
            views : ['year']
        },
        'M' : {
            format : 'yyyy-MM',
            openTo : 'month',
            views : ['month']
        },
        'D' : {
            format : 'yyyy-MM-dd',
            openTo : 'date',
            views : ['date']
        }
    }

    return (
        <React.Fragment>
            <MuiPickersUtilsProvider utils={DateFnsUtils}>
                <KeyboardDatePicker
                    inputVariant = "outlined"
                    variant      = "inline"
                    autoOk       = "true"
                    maxDate      = {new Date()}
                    value        = {value}
                    format       = {pikerInfo[dateCd].format}
                    openTo       = {pikerInfo[dateCd].openTo}
                    views        = {pikerInfo[dateCd].views}
                    onChange     = {(date) => {
                        onChange(date)
                    }}
                />
            </MuiPickersUtilsProvider>
        </React.Fragment>
    )
}

export default DatePicker
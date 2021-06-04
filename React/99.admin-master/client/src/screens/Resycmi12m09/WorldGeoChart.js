import React from 'react'
import Chart from "react-google-charts"

const WorldGeoChart = ({data, callback, styles, mapsApiKey}) => {

    const events = {
        eventName : "select",
        callback : ({chartWrapper}) => {

            const chart = chartWrapper.getChart()
            const selection = chart.getSelection()
            if (selection.length === 0) return
            const region = data[selection[0].row + 1]
            callback(region[0])
        }
    }

    if(Array.isArray(data)) {
        return (
            <Chart
                mapsApiKey  = {mapsApiKey}
                width       = {styles.width}
                height      = {styles.height}
                chartType   = "GeoChart"
                data        = {data}
                chartEvents = {[events]}
                rootProps = {
                    { 'data-testid': '1' }
                }
                options={{
                    colorAxis: { colors: ['green', 'red'] },
                }}
            />
        )
    } else {
        return null
    }
}

export default WorldGeoChart
import React from 'react'
import Chart from "react-google-charts"

const ComboChart = ({data, styles, rgstYy}) => {
    if(Array.isArray(data)) {
        return (
            <Chart
                width={styles.width}
                height={styles.height}
                chartType="ComboChart"
                data={data}
                options={{
                    // title: 'Monthly Coffee Production by Country',
                    vAxis: { title: `${rgstYy} Detect Count` },
                    hAxis: { title: 'Month' },
                    seriesType: 'line',
                    // series: { 1: { type: 'line' } },
                }}
                rootProps={{ 'data-testid': '1' }}
            />
        )
    } else {
        return (
            <div></div>
        )
    }
}

export default ComboChart
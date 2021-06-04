import React from 'react'
import * as UI from '../../utils/material'
import { useTranslation } from 'react-i18next'

const TableOrder = ({data, callback, selectedOrderList}) => {
    const { t } = useTranslation()
 
    const handleClick = (event, id) => {
        const selectedIndex = selectedOrderList.indexOf(id)
        let newSelected = []
    
        if (selectedIndex === -1) {
            newSelected = newSelected.concat(selectedOrderList, id)
        } else
        if (selectedIndex === 0) {
            newSelected = newSelected.concat(selectedOrderList.slice(1))
        } else
        if (selectedIndex === selectedOrderList.length - 1) {
            newSelected = newSelected.concat(selectedOrderList.slice(0, -1))
        } else
        if (selectedIndex > 0) {
            newSelected = newSelected.concat(
                selectedOrderList.slice(0, selectedIndex),
                selectedOrderList.slice(selectedIndex + 1),
            )
        }

        callback(newSelected)
    }

    const handleSelectAllClick = (event) => {
        if (event.target.checked) {
            const newSelecteds = data && data.map((n) => n.order_seq)
            callback(newSelecteds)
            return
        }

        callback([])
    }

    const isSelected = (id) => {
        return selectedOrderList.indexOf(id) !== -1
    }

    return (
        <UI.TableContainer style={{maxHeight : 250}}>
            <UI.Table size="small" stickyHeader>
                <UI.TableHead>
                    <UI.TableRow>
                        <UI.TableCell padding="checkbox">
                            <UI.Checkbox
                                indeterminate={selectedOrderList.length > 0 && selectedOrderList.length < data.length}
                                checked={(data && data.length > 0 && selectedOrderList.length === data.length) || null}
                                onChange={handleSelectAllClick}
                            />
                        </UI.TableCell>
                        <UI.TableCell>{t('image')}</UI.TableCell>
                        <UI.TableCell>{t('product')}</UI.TableCell>
                        <UI.TableCell>{t('detect count')}</UI.TableCell>
                    </UI.TableRow>
                </UI.TableHead>
                <UI.TableBody>
                    {data && data.map((row, idx) => (
                        <UI.TableRow 
                            hover
                            role="checkbox"
                            onClick={(event) => handleClick(event, row.order_seq)}
                            aria-checked={isSelected(row.order_seq)}
                            tabIndex={-1}
                            selected={isSelected(row.order_seq)}
                            key={row.order_seq}
                        >
                            <UI.TableCell padding="checkbox">
                                <UI.Checkbox checked={isSelected(row.order_seq)}/>
                            </UI.TableCell>
                            <UI.TableCell>
                                <UI.Avatar
                                    variant="rounded"
                                    src={row.order_logo_img_url}
                                >
                                    <UI.Typography variant="caption" display="block" gutterBottom>
                                        No Image
                                    </UI.Typography>
                                </UI.Avatar>
                            </UI.TableCell>
                            <UI.TableCell>{row.prod_nm}</UI.TableCell>
                            <UI.TableCell>{row.detect_cnt}</UI.TableCell>
                        </UI.TableRow>
                    ))}
                </UI.TableBody>
            </UI.Table>
        </UI.TableContainer>
    )
}

export default TableOrder
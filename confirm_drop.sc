__on_player_drops_item(player) -> (
    if (tick_time() - global_last_drop_time > 50, 
        display_title(player, 'actionbar', 'Press Q again to drop the item!');

        hand_item = player~'holds';
        inventory_set(player, player~'selected_slot', hand_item:1, hand_item:0, hand_item:2);

        global_last_drop_time = tick_time();

        'cancel';
        ,
        global_last_drop_time = tick_time();
    )
);

__on_player_drops_stack(player) -> (
    if (tick_time() - global_last_drop_time_stack > 50, 
        display_title(player, 'actionbar', 'Press CTRL+Q again to drop the stack!');

        hand_item = player~'holds';
        inventory_set(player, player~'selected_slot', hand_item:1, hand_item:0, hand_item:2);

        global_last_drop_time_stack = tick_time();

        'cancel';
        ,
        global_last_drop_time_stack = tick_time();
    )
)

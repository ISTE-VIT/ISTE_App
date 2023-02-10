const mongoose = require('mongoose');
const FlagshipSchema = mongoose.Schema({
    eventName: String,
    image: String,
    description: String,
    tracks: Array,
});

module.exports = mongoose.model('FlagshipEvent', FlagshipSchema);
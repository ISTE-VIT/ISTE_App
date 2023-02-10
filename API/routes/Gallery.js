const express = require('express');
const router = express.Router();
const Gallery = require('../models/Gallery');
const dotenv = require('dotenv');
dotenv.config();

router.get('/', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const gallery = await Gallery.find();
            res.json(gallery);
        } catch (err) {
            res.json({message: err})
        }
    }
    else
    {
        res.status(400).json({message: "Access Denied"});
    }
});

module.exports = router;